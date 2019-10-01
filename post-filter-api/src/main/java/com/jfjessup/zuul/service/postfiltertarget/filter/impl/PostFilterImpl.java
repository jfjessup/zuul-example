package com.jfjessup.zuul.service.postfiltertarget.filter.impl;

import com.jfjessup.zuul.service.postfiltertarget.filter.PostFilter;
import com.jfjessup.zuul.service.postfiltertarget.model.PostFilterRequest;
import com.jfjessup.zuul.service.postfiltertarget.model.PostFilterResponse;
import com.jfjessup.zuul.service.postfiltertarget.util.RandomUtil;
import org.springframework.stereotype.Component;

@Component
public class PostFilterImpl implements PostFilter {
    private static final int ENRICHMENT_VALUE_SIZE = 20;

    @Override
    public PostFilterResponse filter(PostFilterRequest request) {
        return new PostFilterResponse(
                request.getText(),
                request.getValue() == null
                        ? RandomUtil.getAlphaNumericString(ENRICHMENT_VALUE_SIZE)
                        : request.getValue());
    }
}
