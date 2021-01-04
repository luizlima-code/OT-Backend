package br.com.luizlimacode.orangetalents.resource;

import br.com.luizlimacode.orangetalents.model.Account;
import br.com.luizlimacode.orangetalents.repository.AccountRepository;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/account")
public class AccountResource {

    private AccountRepository accountRepository;

    public AccountResource(AccountRepository accountRepository) {
        super();
        this.accountRepository = accountRepository;
    }

    @PostMapping
    
    public ResponseEntity<Account> createAccount(@RequestBody Account account) {
        try {
            accountRepository.save(account);
            return new ResponseEntity<>(account, HttpStatus.OK);
        } catch (DuplicateKeyException e) {
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
    }
}
