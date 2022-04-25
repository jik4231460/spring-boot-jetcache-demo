package com.codejam.jetcache.controller.dto.req;

import com.codejam.jetcache.dto.common.BaseReq;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetUserNameReq extends BaseReq {

    private Integer key;
}
