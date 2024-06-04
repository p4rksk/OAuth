package shop.mtcoding.loginapp.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.sql.Time;
import java.sql.Timestamp;

public class NaverResponse {

    @Data // getter, setter
    public static class TokenDTO {
        @JsonProperty("access_token") //Json 라이브러리로 이렇게하면 자동으로 파싱이 된다.
        private String accessToken;
        @JsonProperty("token_type")
        private String tokenType;
        @JsonProperty("refresh_token")
        private String refreshToken;
        @JsonProperty("expires_in")
        private Integer expiresIn;
        private String scope; // 조심하자
        @JsonProperty("refresh_token_expires_in")
        private Integer refreshTokenExpiresIn;
    }

    @Data
    public static class NaverUserDTO {
        private Response response;

        @Data
       public class Response{
            private String id;
            private String gender;
            private String email;
            private String name;
        }

    }

//{
//    "resultcode": "00",
//    "message": "success",
//    "response": {
//        "id": "7EWBG1M6Sx6cqLSpsECUTZB8-bhXnvLEV6RUBjcKYKE",
//        "gender": "M",
//        "email": "yeeun0118s@naver.com",
//        "name": "박선규",
//    }
//}

}











