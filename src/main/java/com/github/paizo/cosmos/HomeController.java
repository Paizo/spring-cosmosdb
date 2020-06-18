package com.github.paizo.cosmos;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@Slf4j
@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class HomeController {

    @Value("${azure.cosmosdb.key}")
    private String primaryMasterKey;

    private SimpleRepository repository;

    @GetMapping("master")
    public String getPrimaryMasterKey() {
        return primaryMasterKey;
    }

    @GetMapping("test")
    public String test() {
        String id = "123456789";
        Entity cache = Entity.builder().build();
        log.debug("saving", cache);
        repository.save(cache);
        log.debug("saved");
        Optional<Entity> loaded = repository.findById(id);
        log.debug("loaded", loaded.get());
        repository.deleteAll();
        return "\\o/";
    }

}
