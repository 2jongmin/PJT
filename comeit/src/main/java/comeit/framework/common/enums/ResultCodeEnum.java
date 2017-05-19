package comeit.framework.common.enums;

/**
 * DB로 관리하기 힘든경우 공통된 오류 메시지를 관리를 위한 열거형
 * 보내는 쪽에서 메시지 형식으로 코드를 보내
 * 받는 쪽에서 해당 코드를 이용해 메시지를 찾아 처리한다.
 * to : throw new Exception(ERROR_CODE.LOGIN_ERR_NOT_FOUND_USER.getValue());
 * from :
 *   String code = exception.getMessage();
 *   ERROR_CODE EC = ERROR_CODE.valueOf(ERROR_CODE.class, code);
 *   log.info("메시지 : {}", messageSource(EC.getValue())); 
 * 
 * @author kimhs
 *
 */
public enum ResultCodeEnum {
    LOGIN_ERR_NOT_FOUND_USER("L01"),
    LOGIN_ERR_INVALID_PASSWORD("L02"),
    LOGIN_ERR_NO_APPROVE("L03"),
    LOGIN_ERR_ACCOUNT_LOCK_002("L04"),
    LOGIN_ERR_ACCOUNT_LOCK_003("L05"),
    LOGIN_ERR_ACCOUNT_WITHDRAW("L06"),
    LOGIN_ERR_INVALID_API_ACCESS_TOKEN("L07"),
    L01("fail.common.login.notFoundUserId"),
    L02("fail.common.login.invalidPassword"),
    L03("fail.user.not.approve"),
    L04("fail.user.lock.002"),
    L05("fail.user.lock.003"),
    L06("fail.user.withdraw"),
    L07("fail.common.login.invalidApiAccessToken"),
    L99("fail.user.login"),
    // 처리성공 코드
    SUCCESS_PROCESS("P01"),
    // 처리실패 코드
    FAIL_PROCESS("P02"),
    // 자료없음
    NOT_FOUND("P03")
    ;
    
    private String value;
    
    private ResultCodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
