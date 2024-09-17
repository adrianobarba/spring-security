package adriano.barbosa.springsecurity.controller.dto;

public record LoginResponse(String  accessToken, Long expiresIn) {
}
