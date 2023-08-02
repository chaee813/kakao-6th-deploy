package com.example.kakao.order;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class OrderRequest {
    @Getter
    @Setter
    @ToString
    public static class UpdateDTO {
        private int optionId;
        private int quantity;

        public UpdateDTO(int optionId, int quantity) {
            this.optionId = optionId;
            this.quantity = quantity;
        }
    }
}
