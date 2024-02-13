package com.davymbaimbai.zimhotel.service;

import com.davymbaimbai.zimhotel.model.Room;
import com.davymbaimbai.zimhotel.repository.RoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import javax.sql.rowset.serial.SerialBlob;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Blob;
import java.sql.SQLException;

@RequiredArgsConstructor
public class RoomServiceImpl implements RoomService{

    private final RoomRepository repository;
    @Override
    public Room addNewRoom(MultipartFile file,
                           String roomType,
                           BigDecimal roomPrice) throws IOException,
            SQLException {
        Room room =  new Room();
        room.setRoomType(roomType);
        room.setRoomPrice(roomPrice);
        if (!file.isEmpty()){
            byte[] photoBytes = file.getBytes();
            Blob photoBlob = new SerialBlob(photoBytes);
        }
        return repository.save(room);
    }
}
