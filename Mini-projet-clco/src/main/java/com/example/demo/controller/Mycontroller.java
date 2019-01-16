package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;


@Controller
public class Mycontroller {
    private static String uploadDirectory = System.getProperty("user.dir") + "/uplode";
    @Autowired
    converte converte1;

    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }


    @RequestMapping(value = "/pdffromtxt/upload", method = RequestMethod.POST)
    public String upload(Model model, @RequestParam("file") MultipartFile[] files) {
        StringBuilder fileNames = new StringBuilder();
        for (MultipartFile file : files) {
            Path fileNameAndPath = Paths.get(uploadDirectory, file.getOriginalFilename());
            fileNames.append(file.getOriginalFilename() + " ");


            try {
                Files.write(fileNameAndPath, file.getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        model.addAttribute("msg", "Successfully uploaded files " + fileNames.toString());
        converte1.generatePDFFromTxt(fileNames.toString());
        return "success";
    }
    public void deleteFile(String filename) {
        try {
            File file = new File(uploadDirectory + "/" + filename);
            file.delete();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @GetMapping(value = "/about")
    public String about(){
        return "about";
    }
}