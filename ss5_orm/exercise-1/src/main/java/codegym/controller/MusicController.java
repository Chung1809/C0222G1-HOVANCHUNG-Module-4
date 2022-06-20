package codegym.controller;

import codegym.model.Music;
import codegym.service.IMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MusicController {

    @Autowired
    private IMusicService service;

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("listMusic", service.findAll());
        return "list";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("create", new Music());
        return "create";
    }

    @PostMapping("/create")
    public String createList(Music music) {
        service.save(music);
        return "redirect:/list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id) {
        service.delete(id);
        return "redirect:/list";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("music", service.findById(id));
        return "edit";
    }

    @PostMapping("/edit")
    public String editList(Music music) {
        service.update(music);
        return "redirect:/list";
    }

    @GetMapping("/search")
    public String search(Music music, Model model) {
        List<Music> musicList = service.search(music.getName());
        model.addAttribute("listMusic", musicList);
        return "list";
    }
}
