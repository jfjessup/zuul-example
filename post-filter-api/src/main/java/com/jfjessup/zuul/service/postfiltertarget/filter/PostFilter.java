package com.jfjessup.zuul.service.postfiltertarget.filter;

import com.jfjessup.zuul.service.postfiltertarget.model.PostFilterRequest;
import com.jfjessup.zuul.service.postfiltertarget.model.PostFilterResponse;

public interface PostFilter {
    PostFilterResponse filter(PostFilterRequest request);
}
