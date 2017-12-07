package de.readmore.demo.wordcount;

import org.junit.Before;
import org.junit.Test;

import java.util.Map;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class WordCounterTest {

    private WordCounter underTest;

    @Before
    public void setUp() throws Exception {
        underTest = new WordCounter();
    }

    @Test
    public void shouldReturnEmptyMapForEmptyArray() throws Exception {
        String[] testData = {};

        Map<String, Integer> wordCount = underTest.countWords(testData);

        assertThat(wordCount.size(), is(0));
    }

    @Test
    public void shouldCountOneWord() throws Exception {
        String[] testData = {"foo"};

        Map<String, Integer> wordCount = underTest.countWords(testData);

        assertThat(wordCount.get("foo"), is(1));
    }

    @Test
    public void shouldCountMultipleWords() throws Exception {
        String[] testData = {"foo", "bar"};

        Map<String, Integer> wordCount = underTest.countWords(testData);

        assertThat(wordCount.size(), is(2));
        assertThat(wordCount.get("foo"), is(1));
        assertThat(wordCount.get("bar"), is(1));
    }

    @Test
    public void shouldCountWordsWithMultipleOccurence() throws Exception {
        String[] testData = {"foo", "bar", "foo", "foo", "bar"};

        Map<String, Integer> wordCount = underTest.countWords(testData);

        assertThat(wordCount.size(), is(2));
        assertThat(wordCount.get("foo"), is(3));
        assertThat(wordCount.get("bar"), is(2));
    }
}