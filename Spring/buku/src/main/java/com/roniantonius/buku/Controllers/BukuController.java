package com.roniantonius.buku.Controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.roniantonius.buku.Domain.Buku;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class BukuController {
	@GetMapping(path = "/buku-buku")
	public Buku retrieveBook() {
		return Buku.builder()
				.nib("123-123-123-123")
				.nama("Dinamika Populasi")
				.penulis("Soetjadi")
				.tahunTerbit("2014")
				.build();
	}
	
	@PostMapping(path = "/buku-buku")
	public Buku createBook(@RequestBody final Buku book) {
		log.info("Buku ditemukan! " + book.toString());
		return book; // kita bakal return sebagai Json di sini
	}
}
