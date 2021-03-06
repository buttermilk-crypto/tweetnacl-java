/*
Copyright 2016, David R. Smith, All Rights Reserved

This file is part of TweetPepper.

TweetPepper is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

TweetPepper is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with TweetPepper.  If not, see <http://www.gnu.org/licenses/>.

*/

package com.cryptoregistry.tweet.pepper.key;

import java.util.Arrays;

public class PublicKey extends Key {

	public PublicKey(byte[] bytes) {
		super(bytes);
	}
	
	PublicKey(byte[] bytes,boolean alive) {
		super(bytes,alive);
	}
	
	public boolean equals(Object obj){
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		PublicKey k = (PublicKey) obj;
		if((this.alive != k.alive)) return false; 
		return Arrays.equals(this.getBytes(),k.getBytes());
	}

}
