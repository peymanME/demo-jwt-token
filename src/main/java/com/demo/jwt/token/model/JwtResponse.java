package com.demo.jwt.token.model;

import java.io.Serializable;
/**
 * @author peyman.ekhtiar on 2021-04-22
 */
public class JwtResponse implements Serializable {

	private static final long serialVersionUID = -8109872404690919844L;
	private final String jwttoken;

	public JwtResponse(String jwttoken) {
		this.jwttoken = jwttoken;
	}

	public String getToken() {
		return this.jwttoken;
	}
}