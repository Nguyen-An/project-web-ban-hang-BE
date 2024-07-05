package com.project.shopapp.responses;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Paging {
    private int totalPage;
    private Long totalRecord;
    private int page;
    private int size;
}
