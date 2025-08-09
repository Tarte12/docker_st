package com.blog;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blogs")
@RequiredArgsConstructor
public class BlogController {

    private final BlogRepository repo;

    @PostMapping
    public Blog create(@RequestBody Blog blog) { return repo.save(blog); }

    @GetMapping
    public List<Blog> readAll() { return repo.findAll(); }

    @GetMapping("/{id}")
    public Blog readOne(@PathVariable Long id) { return repo.findById(id).orElseThrow(); }

    @PutMapping("/{id}")
    public Blog update(@PathVariable Long id, @RequestBody Blog blog) {
        blog.id = id;
        return repo.save(blog);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { repo.deleteById(id); }
}
