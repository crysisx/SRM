package com.sxt.commons.utils;

/**
 * ������
 * @author ������Ѽ
 * @email dengpbs@163.com
 *
 */
public enum ErrorCode {

    SYSTEM_ERROR(500, "ϵͳ����"),
    PARAMETER_CHECK_ERROR(400, "����У�����"),
    AUTH_VALID_ERROR(701, "�û�Ȩ�޲���"),
    UNLOGIN_ERROR(401, "�û�δ��¼���¼״̬��ʱʧЧ"),
    ;

    private final Integer value;
    private final String message;

    ErrorCode(int value, String message) {
        this.value = value;
        this.message = message;
    }

    public int getValue() {
        return value;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return value.toString();
    }

    public String getCode() {
        return value.toString();
    }

    public static ErrorCode getByCode(Integer value) {
        for (ErrorCode _enum : values()) {
            if (_enum.getValue() == value) {
                return _enum;
            }
        }
        return null;
    }

}

