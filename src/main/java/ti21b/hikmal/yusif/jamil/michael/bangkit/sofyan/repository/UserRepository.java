package ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.repository;

import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.entity.User;

import java.sql.SQLException;

public interface UserRepository {
    
    User insert(User user);

    User update(User user);

    User findById(String id);

    void deleteAll() throws SQLException;

}
