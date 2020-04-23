package com.seasungames.model;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Min;

/**
 * Created by jianghaitao on 2020/4/22.
 */
@Getter
@Setter
@Builder
@RegisterForReflection
public class AppsRequest {
    @Min(message="page min value is 1", value=1)
    int page;
}
