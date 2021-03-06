/*
 * Copyright <2021> <Rachell Mardones-Luna>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package cl.ucn.disc.dsm.rmardones.news.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.threeten.bp.ZoneId;
import org.threeten.bp.ZonedDateTime;

import cl.ucn.disc.dsm.rmardones.news.model.News;
import lombok.extern.slf4j.Slf4j;

/**
 * Test of {@link News}.
 *
 * @author Rachell Mardones-Luna.
 */
@Slf4j
public class TestNews {

    /**
     * Test the Constructor.
     */
    @Test
    public void testConstructor(){

        log.debug("Testing Constructor ..");
        //Constructor OK
        {
            News news = new News(
                    "Autoridades UCN informan a las unidades los detalles del Plan Retorno y piden acelerar regreso",
                    "Noticias UCN",
                    "UCN",
                    "https://www.noticias.ucn.cl/destacado/autoridades-ucn-informan-a-las-unidades-los-detalles-del-plan-retorno-y-piden-acelerar-regreso/",
                    "https://www.noticias.ucn.cl/wp-content/uploads/2021/11/WhatsApp-Image-2021-11-05-at-13.26.53-1.jpeg",
                    "En reuniones presenciales realizadas en la Casa Central se expusieron las medidas adoptadas y se respondieron las dudas de los y las representantes de las distintas unidades de la Universidad.",
                    "Directores/as y representantes de las distintas unidades acad??micas de Antofagasta de la Universidad Cat??lica del Norte (UCN), recibieron con aprobaci??n los detalles del Plan Retorno que desarrolla nuestra Casa de Estudios. En dos reuniones presenciales realizadas en el auditorio Andr??s Sabella de la Casa Central, el vicerrector acad??mico, Nelson Fern??ndez Vergara; la vicerrectora de Asuntos Econ??micos y Administrativos, Ingrid ??lvarez Arzic; y la directora de la Direcci??n de Personas (ex Direcci??n de Recursos Humanos) Alejandra Pizarro V??liz, les explicaron los detalles del proceso, respondiendo tambi??n las dudas de los y las asistentes.",
                    ZonedDateTime.now(ZoneId.of("-4"))



            );

            Assertions.assertNotNull(news, "The News was null");
            Assertions.assertNotNull(news.getId(), "The Id was null");
            Assertions.assertNotNull(news.getTitle(), "The Title was null");
            Assertions.assertNotNull(news.getSource(), "The Source was null");
            Assertions.assertNotNull(news.getAuthor(), "The Author was null");
            Assertions.assertNotNull(news.getUrl(), "The URL was null");
            Assertions.assertNotNull(news.getUrlImage(), "The URL Image was null");
            Assertions.assertNotNull(news.getDescription(), "The Description was null");
            Assertions.assertNotNull(news.getContent(), "The Content was null");
            Assertions.assertNotNull(news.getPublishedAt(), "The PublishedAt  was null");
        }

        //Constructor no OK
        {
            Assertions.assertThrows(IllegalArgumentException.class, () -> new News(

                    null,
                    "Noticias UCN",
                    "UCN",
                    "https://www.noticias.ucn.cl/destacado/autoridades-ucn-informan-a-las-unidades-los-detalles-del-plan-retorno-y-piden-acelerar-regreso/",
                    "https://www.noticias.ucn.cl/wp-content/uploads/2021/11/WhatsApp-Image-2021-11-05-at-13.26.53-1.jpeg",
                    "En reuniones presenciales realizadas en la Casa Central se expusieron las medidas adoptadas y se respondieron las dudas de los y las representantes de las distintas unidades de la Universidad.",
                    "Directores/as y representantes de las distintas unidades acad??micas de Antofagasta de la Universidad Cat??lica del Norte (UCN), recibieron con aprobaci??n los detalles del Plan Retorno que desarrolla nuestra Casa de Estudios. En dos reuniones presenciales realizadas en el auditorio Andr??s Sabella de la Casa Central, el vicerrector acad??mico, Nelson Fern??ndez Vergara; la vicerrectora de Asuntos Econ??micos y Administrativos, Ingrid ??lvarez Arzic; y la directora de la Direcci??n de Personas (ex Direcci??n de Recursos Humanos) Alejandra Pizarro V??liz, les explicaron los detalles del proceso, respondiendo tambi??n las dudas de los y las asistentes.",
                    ZonedDateTime.now(ZoneId.of("-4"))


            ));

            Assertions.assertThrows(IllegalArgumentException.class, () -> new News(

                    "Autoridades UCN informan a las unidades los detalles del Plan Retorno y piden acelerar regreso",
                    null,
                    "UCN",
                    "https://www.noticias.ucn.cl/destacado/autoridades-ucn-informan-a-las-unidades-los-detalles-del-plan-retorno-y-piden-acelerar-regreso/",
                    "https://www.noticias.ucn.cl/wp-content/uploads/2021/11/WhatsApp-Image-2021-11-05-at-13.26.53-1.jpeg",
                    "En reuniones presenciales realizadas en la Casa Central se expusieron las medidas adoptadas y se respondieron las dudas de los y las representantes de las distintas unidades de la Universidad.",
                    "Directores/as y representantes de las distintas unidades acad??micas de Antofagasta de la Universidad Cat??lica del Norte (UCN), recibieron con aprobaci??n los detalles del Plan Retorno que desarrolla nuestra Casa de Estudios. En dos reuniones presenciales realizadas en el auditorio Andr??s Sabella de la Casa Central, el vicerrector acad??mico, Nelson Fern??ndez Vergara; la vicerrectora de Asuntos Econ??micos y Administrativos, Ingrid ??lvarez Arzic; y la directora de la Direcci??n de Personas (ex Direcci??n de Recursos Humanos) Alejandra Pizarro V??liz, les explicaron los detalles del proceso, respondiendo tambi??n las dudas de los y las asistentes.",
                    ZonedDateTime.now(ZoneId.of("-4"))


            ));

            Assertions.assertThrows(IllegalArgumentException.class, () -> new News(

                    "Autoridades UCN informan a las unidades los detalles del Plan Retorno y piden acelerar regreso",
                    "Noticias UCN",
                    null,
                    "https://www.noticias.ucn.cl/destacado/autoridades-ucn-informan-a-las-unidades-los-detalles-del-plan-retorno-y-piden-acelerar-regreso/",
                    "https://www.noticias.ucn.cl/wp-content/uploads/2021/11/WhatsApp-Image-2021-11-05-at-13.26.53-1.jpeg",
                    "En reuniones presenciales realizadas en la Casa Central se expusieron las medidas adoptadas y se respondieron las dudas de los y las representantes de las distintas unidades de la Universidad.",
                    "Directores/as y representantes de las distintas unidades acad??micas de Antofagasta de la Universidad Cat??lica del Norte (UCN), recibieron con aprobaci??n los detalles del Plan Retorno que desarrolla nuestra Casa de Estudios. En dos reuniones presenciales realizadas en el auditorio Andr??s Sabella de la Casa Central, el vicerrector acad??mico, Nelson Fern??ndez Vergara; la vicerrectora de Asuntos Econ??micos y Administrativos, Ingrid ??lvarez Arzic; y la directora de la Direcci??n de Personas (ex Direcci??n de Recursos Humanos) Alejandra Pizarro V??liz, les explicaron los detalles del proceso, respondiendo tambi??n las dudas de los y las asistentes.",
                    ZonedDateTime.now(ZoneId.of("-4"))


            ));

            //TODO: Test the description, content and publishedAt



        }


    }
}
