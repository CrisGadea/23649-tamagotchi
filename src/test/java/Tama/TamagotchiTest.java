package Tama;

import org.junit.Assert;
import org.junit.Test;

public class TamagotchiTest {

    @Test
    public void testQuePruebaQuePuedoCrearUnTama(){
        Tamagotchi tama = new Tamagotchi();

        Assert.assertNotNull(tama);
    }

    @Test
    public void testQuePruebaQuePuedoCrearUnTamaConNombre(){
        // Pasos para resolver los test
        // 1. Declaramos los objetos y atributos necesarios
        // 2. Ejecutamos el método a probar (original)
        // 3. Validamos mediante Assert la prueba

        Tamagotchi tama = new Tamagotchi("Cris");

        String obtenido = tama.getNombre();

        String esperado = "Cris";

        Assert.assertEquals(obtenido, esperado);
    }

    @Test
    public void testParaCrearDosTamasConDistintoNombre(){
        Tamagotchi tama = new Tamagotchi("Cris");
        Tamagotchi tama2 = new Tamagotchi("Cleo");

        String obtenido1 = tama.getNombre();

        String esperado1 = "Cris";

        String obtenido2 = tama2.getNombre();

        String esperado2 = "Cleo";

        Assert.assertEquals(obtenido1, esperado1);
        Assert.assertEquals(obtenido2, esperado2);
    }

    @Test
    public void testNivelInicialTamagochiEnCero(){
        Tamagotchi tama = new Tamagotchi("Cris");
        Integer nivelEsperado = 0;
        Integer nivelActual = tama.getNivel();
        Assert.assertEquals(nivelEsperado, nivelActual);
    }

    @Test
    public void testParaDarleUnEstadoAUnTama(){
        Tamagotchi tama = new Tamagotchi("Cris");
        String nuevoEstado = "hambriento";
        tama.setEstado("hambriento");
        Assert.assertEquals(nuevoEstado, tama.getEstado());
    }

    @Test
    public void testQuePruebaQueTamaPuedeComer(){
        Tamagotchi tama = new Tamagotchi("Romina");
        Assert.assertTrue(tama.comer());
    }

    @Test
    public void testPasajeDeEstadoAlComerEstandoHambriento(){
        Tamagotchi tama = new Tamagotchi("Cris");
        // Ahora el estado debería ser hambrienta
        tama.setEstado("hambrienta");
        tama.comer();
        String estadoEsperado = "contenta";

        Assert.assertEquals(estadoEsperado, tama.getEstado());
    }

    @Test
    public void testParaIncrementarNivelSiTamaComeContento(){
        Tamagotchi tama = new Tamagotchi("Cris");
        // Ahora el estado debería ser contenta
        tama.setEstado("contenta");
        tama.comer();
        Integer nivelEsperado = 1;
        Assert.assertEquals(nivelEsperado, tama.getNivel());
    }

    @Test
    public void testParaQueTamaSeDiviertaLuegode80Mins(){
        Tamagotchi tama = new Tamagotchi("Cris");
        // Ahora el estado debería ser aburrida
        tama.setEstado("aburrida");

        // Si el tiempo es mayor a 80 minutos debería cambiar su estado
        tama.comer();

        String estadoEsperado = "contenta";

        Assert.assertEquals(estadoEsperado, tama.getEstado());
    }

    @Test
    public void testQuePruebeQueTamaJuegueYCambieDeEstado(){
        Tamagotchi tama = new Tamagotchi("Cris");
        tama.setEstado("aburrida");
        String estadoEsperado = "contenta";
        tama.jugar();
        Assert.assertEquals(estadoEsperado, tama.getEstado());
    }

    @Test
    public void testQuePruebeQueTamaJuegueContentaAumentandoSuNivel(){
        Tamagotchi tama = new Tamagotchi("Cris");
        tama.setEstado("contenta");
        Integer nivelEsperado = 2;
        tama.jugar();
        Assert.assertEquals(nivelEsperado, tama.getNivel());
    }

}
