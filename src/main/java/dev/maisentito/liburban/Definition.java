/*
 * Definition.java
 *
 * Copyright (c) 2015  forsenonlhaimaisentito
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package dev.maisentito.liburban;

import java.net.URL;

/**
 * Represents a single definition for a term.
 */
public class Definition {
	public int mId;
	public String mWord;
	public String mAuthor;
	public URL mLink;
	public String mDefinition;
	public String mExample;
	public int mThumbsUp;
	public int mThumbsDown;
	public String mCurrentVote;

	public int getId() {
		return mId;
	}

	public void setId(int id) {
		this.mId = id;
	}

	public String getWord() {
		return mWord;
	}

	public void setWord(String word) {
		this.mWord = word;
	}

	public String getAuthor() {
		return mAuthor;
	}

	public void setAuthor(String author) {
		this.mAuthor = author;
	}

	public URL getLink() {
		return mLink;
	}

	public void setLink(URL link) {
		this.mLink = link;
	}

	public String getDefinition() {
		return mDefinition;
	}

	public void setDefinition(String definition) {
		this.mDefinition = definition;
	}

	public String getExample() {
		return mExample;
	}

	public void setExample(String example) {
		this.mExample = example;
	}

	public int getThumbsUp() {
		return mThumbsUp;
	}

	public void setThumbsUp(int thumbs_up) {
		this.mThumbsUp = thumbs_up;
	}

	public int getThumbsDown() {
		return mThumbsDown;
	}

	public void setThumbsDown(int thumbs_down) {
		this.mThumbsDown = thumbs_down;
	}

	public String getCurrentVote() {
		return mCurrentVote;
	}

	public void setCurrentVote(String current_vote) {
		this.mCurrentVote = current_vote;
	}
}