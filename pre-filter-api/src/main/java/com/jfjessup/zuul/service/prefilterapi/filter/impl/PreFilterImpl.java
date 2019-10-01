package com.jfjessup.zuul.service.prefilterapi.filter.impl;

import com.jfjessup.zuul.service.prefilterapi.model.PreFilterRequest;
import com.jfjessup.zuul.service.prefilterapi.model.PreFilterResponse;
import com.jfjessup.zuul.service.prefilterapi.filter.PreFilter;
import org.springframework.stereotype.Component;

@Component
public class PreFilterImpl implements PreFilter {

    @Override
    public PreFilterResponse filter(PreFilterRequest request) {
        return new PreFilterResponse(request.getText(), request.isFilterIn());
    }
}
