package com.novelbot.api.dto.purchase;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class PurchaseRequest {
    private int episodeId;
    private int novelId;
}
