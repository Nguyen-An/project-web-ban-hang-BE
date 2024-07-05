package com.project.shopapp.responses;

import lombok.*;

import java.util.List;
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ListPagingResponse<T> {
    private List<T> elements;

    private Paging paging;
}
