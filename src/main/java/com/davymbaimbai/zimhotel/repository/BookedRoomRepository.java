package com.davymbaimbai.zimhotel.repository;

import com.davymbaimbai.zimhotel.model.BookedRoom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookedRoomRepository extends JpaRepository<BookedRoom, Long> {
}
