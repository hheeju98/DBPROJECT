package site.metacoding.dbproject.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
public class PostController {

    // GET글쓰기페이지 /post/writeForm
    @GetMapping("/post/writeForm")
    public String writeForm() {
        return "post/writeForm";
    }

    // 메인페이지
    // GET글목록 페이지 /post/list,/
    // @GetMapping({"/","/post/list"})
    @GetMapping({ "/", "/post/list" })
    public String list() {
        return "post/list";
    }

    // Get글상세보기 페이지 /post/{id} (삭제버튼 만들어 두면 됨. 수정버튼 만들어 두면 됨)
    @GetMapping("/post/{id}")
    public String detail(@PathVariable Integer id) {
        return "post/detail";
    }

    // Get글수정페이지 /post/{id}/updateForm
    @GetMapping("/post/{id}/updateForm")
    public String updateForm(@PathVariable Integer id) {
        return "post/updateForm"; // ViewResolver도움받음
    }

    // DELETE글삭제 /post/{id} - 글목록으로 가기
    @DeleteMapping("/post/{id}")
    public String delete(@PathVariable Integer id) {
        // return "redirect:/post/list";
        return "redirect:/";
    }

    // UPDATE 글수정/post/{id} -글상세보기 페이지가기
    @PutMapping("/post/{id}")
    public String update(@PathVariable Integer id) {
        return "redirect:/post/" + id;
    }

    // POST 글쓰기 /post -글목록으로 가기
    @PostMapping("/post")
    public String write() {
        return "redirect:/";
        // return "redirect:/post/list";
    }

}
