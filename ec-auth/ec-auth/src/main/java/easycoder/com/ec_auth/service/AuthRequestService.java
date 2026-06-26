package easycoder.com.ec_auth.service;

import easycoder.com.ec_auth.dto.AuthRequestDto;

public interface AuthRequestService
{

    void signUp(AuthRequestDto authRequestDto);
}
