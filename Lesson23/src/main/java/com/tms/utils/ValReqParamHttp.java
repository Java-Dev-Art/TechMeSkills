package com.tms.utils;

import com.tms.exceptions.RequestParNullException;
import com.tms.filters.FilterNews;

import java.util.Optional;

public class ValReqParamHttp {
    private static final String REQ_PAR_NULL = "Request param is not initialized";

    public static void validParNotNull(String param) throws RequestParNullException {
        if (!Optional.ofNullable(param).isPresent()){
            throw new RequestParNullException(REQ_PAR_NULL);
        }
    }
}
