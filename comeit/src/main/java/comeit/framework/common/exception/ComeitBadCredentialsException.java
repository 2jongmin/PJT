package comeit.framework.common.exception;

import comeit.framework.common.enums.ResultCodeEnum;

import org.springframework.security.authentication.BadCredentialsException;

public class ComeitBadCredentialsException extends BadCredentialsException {
    private static final long serialVersionUID = 3733662755402145229L;
    private ResultCodeEnum rc;
    
    public ComeitBadCredentialsException(String msg) {
        super(msg);
    }
    
    public ComeitBadCredentialsException(String msg, ResultCodeEnum rc) {
        super(msg);
        this.rc = rc;
    }
    
    public ResultCodeEnum getResultCode() {
        return rc;
    }
}
