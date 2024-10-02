package com.tresit.profile.lenguajes.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.tresit.profile.lenguajes.models.Tritiano;

@FeignClient(url = "localhost:8001", name = "servicio-tritianos")
public interface TritianoFeignClient {

    @GetMapping
    List<Tritiano> list();

    @GetMapping("/{id}")
    Tritiano details(@PathVariable Long id);

}
