package easycoder.com.ec_auth.repository;

import easycoder.com.ec_auth.entity.AuthRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface AuthRequestRepository extends JpaRepository<AuthRequest,Long>
{
    @Query
            ("""
                    SELECT ar FROM AuthRequest
                    WHERE ar.email = :email
                    OR ar.contact = :contact
                    """)
    AuthRequest findByEmailAndContact(@Param("email") String email,@Param("contact") String contact);
}
