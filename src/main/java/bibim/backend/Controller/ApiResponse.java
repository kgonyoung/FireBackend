package bibim.backend.Controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;

@AllArgsConstructor
@Getter
public class ApiResponse {

    String content;

    public static ApiResponse create(String content) {
        return new ApiResponse(content);
    }
}


