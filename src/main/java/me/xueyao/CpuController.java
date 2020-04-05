package me.xueyao;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author Simon.Xue
 * @date 2020-04-05 09:31
 **/
@RestController
@RequestMapping("/cpu")
public class CpuController {

    /**
     * 这只是个示例
     */
    @GetMapping("/100")
    public void c100() {

        List<String> bigList = new ArrayList<>();
        for (; ; ) {
            bigList.add(UUID.randomUUID().toString());
            bigList.addAll(bigList);
        }
    }
}
