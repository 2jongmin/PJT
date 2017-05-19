function login() {
    if(isEmpty($("#userId").val())) {
        alertMessage("error.user.required.id");
        $("#userId").focus();
        return false;
    }
    if(isEmpty($("#password").val())) {
        alertMessage("error.user.required.password");
        $("#password").focus();
        return false;
    }
    
    return true;
}