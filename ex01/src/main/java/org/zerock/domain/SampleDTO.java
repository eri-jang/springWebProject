package org.zerock.domain;

import lombok.Data;

//getter, setter, equals(), toString()등 메소드 자동생성하는 lokbok 어노테이션
@Data
public class SampleDTO {
	private String name;
	private int age;
}
