package com.sashel.seller_service.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sashel.seller_service.dto.*;
import com.sashel.seller_service.service.SellerService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(ControllerMappedSeller.class)
class ControllerMappedSellerTest {

    @Autowired private MockMvc mock;
    @MockBean private SellerService sellerService;
    @Autowired private ObjectMapper objectMapper;

    @Test void onboardSeller_returnsOk() throws Exception {
        Mockito.when(
                sellerService.onboardSeller(any())
        ).thenReturn(
                new DTOSellerResponse(
                        1L,
                        "Biz",
                        "Addr",
                        "Desc",
                        "logo.png",
                        "img.png",
                        true,
                        "sku123",
                        100,
                        4.7f
                )
        );
        mock.perform(
                post("/seller")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(
                                new DTOUserIdRequest(1L)
                        ))
        ).andExpect(
                status().isOk()
        );
    }


    @Test void getSellerShouldRespondBackJSON() throws Exception {
        Mockito.when(
                sellerService.getSellerById(2005L)
        ).thenReturn(
                new DTOSellerResponse(
                        2005L,
                        "Biz",
                        "Addr",
                        "Desc",
                        "logo.png",
                        "img.png",
                        true,
                        "sku123",
                        100,
                        4.7f
                )
        );
        mock.perform(
                get(
                        "/seller/2005"
                )
        ).andExpect(
                status().isOk()
        );
    }


    @Test void updateSeller_returnsOk() throws Exception {
        Mockito.when(
                sellerService.updateSeller(eq(1L), any())
        ).thenReturn(
                new DTOSellerResponse(
                        1L,
                        "NewBiz",
                        "NewAddr",
                        "NewDesc",
                        "newlogo.png",
                        "newimg.png",
                        false,
                        "sku999",
                        50,
                        3.9f
                )
        );
        mock.perform(
                put("/seller/1")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(
                                new DTOSellerRequest(
                                        "NewBiz",
                                        "NewAddr",
                                        "NewDesc",
                                        "newlogo.png",
                                        "newimg.png"
                                )
                        ))
        ).andExpect(
                status().isOk()
        );
    }


}
