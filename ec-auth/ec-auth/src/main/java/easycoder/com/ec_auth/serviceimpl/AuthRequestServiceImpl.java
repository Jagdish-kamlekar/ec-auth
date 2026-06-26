package easycoder.com.ec_auth.serviceimpl;

import easycoder.com.ec_auth.dto.AuthRequestDto;
import easycoder.com.ec_auth.dto.PersonInfoDto;
import easycoder.com.ec_auth.entity.AuthRequest;
import easycoder.com.ec_auth.entity.PersonInfo;
import easycoder.com.ec_auth.exception.BusinessException;
import easycoder.com.ec_auth.repository.AuthRequestRepository;
import easycoder.com.ec_auth.service.AuthRequestService;
import easycoder.com.ec_auth.util.Constant;
import easycoder.com.ec_auth.util.MsgConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class AuthRequestServiceImpl implements AuthRequestService
{
    @Autowired
    @Lazy
    private AuthRequestRepository authRequestRepository;

    @Override
    public void signUp(AuthRequestDto authRequestDto)
    {
        AuthRequest existingUser = null;
        PersonInfo studentBasicDetails = null;

        try
        {
            existingUser = authRequestRepository.findByEmailAndContact(authRequestDto.getEmail(),authRequestDto.getContact());

            if(existingUser != null)
            {
                throw new BusinessException(Constant.BAD_REQUEST, MsgConstant.ACCOUNT_ALREADY_ACTIVATED);
            }

            AuthRequest authRequest = new AuthRequest();

            authRequest.setEmail(authRequestDto.getEmail());
            authRequest.setContact(authRequestDto.getContact());
            authRequest.setStatus(0);

            authRequestRepository.save(authRequest);



        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
