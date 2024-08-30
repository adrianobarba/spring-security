package adriano.barbosa.springsecurity.dto;

public record LoginResponse(String  accessToken, Long expiresIn) {
}
