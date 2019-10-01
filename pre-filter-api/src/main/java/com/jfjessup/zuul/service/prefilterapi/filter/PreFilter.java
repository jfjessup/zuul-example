package com.jfjessup.zuul.service.prefilterapi.filter;

import com.jfjessup.zuul.service.prefilterapi.model.PreFilterRequest;
import com.jfjessup.zuul.service.prefilterapi.model.PreFilterResponse;

public interface PreFilter {
    PreFilterResponse filter(PreFilterRequest request);
}
