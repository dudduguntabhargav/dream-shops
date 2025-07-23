package com.ecommerce.dreamshops.controllers;

import com.ecommerce.dreamshops.dto.ImageDto;
import com.ecommerce.dreamshops.model.Image;
import com.ecommerce.dreamshops.response.ApiResponse;
import com.ecommerce.dreamshops.service.image.IImageService;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("${api.prefix}/images")

public class ImageController {

    private final IImageService imageService;

    @PostMapping("/upload")
    public ResponseEntity<ApiResponse> saveImages(@RequestParam List<MultipartFile> files, @RequestParam Long productId){
        try {
            List<ImageDto> imageDtos = imageService.saveImages(productId, files);
            return ResponseEntity.ok(new ApiResponse("Upload success!",imageDtos));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new ApiResponse("Upload Failed!",e.getMessage()));
        }

    }


    public ResponseEntity<ApiResponse> downloadImage(@PathVariable Long imageId){
        Image image = imageService.getImageById(imageId);
        ByteArrayResource resource = new ByteArrayResource(image.)
    }


}
