/*
 * Copyright <2021> <Rachell Mardones-Luna>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package cl.ucn.disc.dsm.rmardones.news.services;

import com.github.javafaker.Faker;

import org.threeten.bp.ZoneId;
import org.threeten.bp.ZonedDateTime;

import java.util.ArrayList;
import java.util.List;

import cl.ucn.disc.dsm.rmardones.news.model.News;

/**
 *  Contract Implementation of News with Faker.
 */
public class ContractsImplFaker implements Contracts {
    /**
     *
     * @return all the News in the backend ordered by publishedAt.
     */
    @Override
    public List<News> retrieveNews(final int size) {

        //Faker provider
        final Faker faker = new Faker();

        //The List to return
        final List<News> newsList = new ArrayList<>();

        for (int i = 0; i < size; i++){
            News news = new News(
                    faker.superhero().name(),
                    faker.artist().name(),
                    faker.artist().name(),
                    faker.internet().url(),
                    faker.internet().url(),
                    faker.backToTheFuture().quote(),
                    faker.artist().name(),
                    ZonedDateTime.now(ZoneId.of("-4"))
            );

            newsList.add(news);
        }

        return newsList;
    }
}
