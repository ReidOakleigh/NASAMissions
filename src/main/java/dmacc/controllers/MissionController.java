package dmacc.controllers;

import dmacc.beans.Mission;
import dmacc.model.MissionRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MissionController {
	
    private final MissionRepository repo;
    public MissionController(MissionRepository repo) {
        this.repo = repo;
    }
    @GetMapping("/missions")
    public String getMissions( Model model) {
        final List<Mission> missions = repo.findAll();
        missions.forEach(System.out::println);
        model.addAttribute("count", missions.size());
        model.addAttribute("missions", missions);
        return "missions";
    }
}
