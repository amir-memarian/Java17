package mojodatZendeh;

import khodro.Keshti;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MojodatZendehBayad {
    @Test
    void az_ham_ers_bari_konand() {
        Keshti keshti = new Keshti();
        Giahan giahan = new Giahan();

        assertThat(giahan instanceof MojodatZendeh).isTrue();

        //assertThat(keshti instanceof MojodatZendeh).isFalse();
    }
}
