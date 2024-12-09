import org.junit.Test;
import testIdentifier.Identifier;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IdentifierTest {
    private final Identifier identifier = new Identifier();

    @Test
    public void minimoUmCaracteresInvalido() {
        assertTrue( "Identificadores com no mínimo de 1 caractere devem ser válidos", identifier.validateIdentifier("a"));
    }

    @Test
    public void maximoSeisCaracteresValido() {
        assertTrue( "Identificadores com até 6 caracteres devem ser válidos", identifier.validateIdentifier("abc123"));
    }

    @Test
    public void identificadorVazio() {
        assertFalse("Identificador vazio deve ser inválido", identifier.validateIdentifier(""));
    }

    @Test
    public void acimaDoLimiteCaracteresInvalido() {
        assertFalse("Identificadores com mais de 6 caracteres devem ser inválidos", identifier.validateIdentifier("abcdef1"));
    }

    @Test
    public void comecaComNumeroInvalido() {
        assertFalse("O primeiro caractere não pode ser um número, logo o identificador deve ser inválido", identifier.validateIdentifier("1abc"));
    }

    @Test
    public void caracteresEspeciaisInvalidos() {
        assertFalse( "Identificadores com caracteres especiais devem ser inválidos", identifier.validateIdentifier("abc!"));
    }
}
