package guru.springframework.sfgpetclinic.controller;

import guru.springframework.sfgpetclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/owmers")  If I assign it to here, i have to change requestMapping below
public class ownerController {
    //@RequestMapping({"/0", "/index", "/index.html"})

    private final OwnerService ownerService;

    public ownerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"/owners", "/owners/index", "/owners/index.html"})
    public String listOwners(Model model) {
        model.addAttribute("owners", ownerService.findAll());
        return "owners/index";
    }

    @RequestMapping("/owners/find")
    public String findOwners() {
        return "notimplemented";
    }
}
