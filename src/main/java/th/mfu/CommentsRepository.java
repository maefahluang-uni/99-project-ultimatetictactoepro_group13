package th.mfu;

import org.springframework.data.repository.CrudRepository;
import th.mfu.domain.Comments;

public interface CommentsRepository extends CrudRepository <Comments,Long> {
    
}
