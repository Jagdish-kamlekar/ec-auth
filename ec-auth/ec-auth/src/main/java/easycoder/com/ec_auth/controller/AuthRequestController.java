package easycoder.com.ec_auth.controller;

import easycoder.com.ec_auth.dto.AuthRequestDto;
import easycoder.com.ec_auth.service.AuthRequestService;
import easycoder.com.ec_auth.util.ApiResponse;
import easycoder.com.ec_auth.util.Constant;
import easycoder.com.ec_auth.util.MsgConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AuthRequestController
{
    @Autowired
    @Lazy
    private AuthRequestService authRequestService;

    @PostMapping("/sign-up")
    private ApiResponse<?> signUp(@RequestBody AuthRequestDto authRequestDto)
    {
        authRequestService.signUp(authRequestDto);
        return new ApiResponse<>(true, Constant.OK, MsgConstant.SIGNED_UP_SUCCESSFULLY,null);
    }
}
