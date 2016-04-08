package com.skoogiz.bestiary.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class CharacterTemplateTest {

	@Test
	public void test() {
		
		CharacterTemplate template = new CharacterTemplate.Builder("H�galv")
				.rarity(Rarity.RARE).habitat("4ABG").movement("L10")
				.ability("STY", "2T6+3").ability("STO", "2T4+7")
				.ability("FYS", "1T6+2").ability("SMI", "3T6")
				.ability("INT", "4T6").ability("PSY", "4T6+1")
				.ability("KAR", "3T6").skill("G�"
						+ "mma sig", 6)
				.skill("Uppt�cka fara", 10).build();

		System.out.printf("Ras: %s%n", template.getRace());
		System.out.printf("Hemvist: %s%n", template.getHabitat());
		System.out.printf("Vanlighet: %s%n", template.getRarity().name());
		System.out.printf("Grundegenskaper%n");
		for (String name : template.getAbilities().keySet()) {
			System.out.printf("  %s > %s%n", name,
					template.getAbilities().get(name));
		}
		System.out.printf("F�rm�gor%n");
		for (String name : template.getSpecialAbilities().keySet()) {
			System.out.printf("  %s > %s%n", name, template
					.getSpecialAbilities().get(name));
		}
		System.out.printf("F�rdigheter%n");
		for (String name : template.getSkills().keySet()) {
			System.out.printf("  %s > %s%n", name,
					template.getSkills().get(name));
		}
		System.out.printf("F�rflyttning: %s%n", template.getMovement());
		System.out.printf("Naturliga Skydd: %s%n", template.getProtection());
		
		Character character = Character.generateCharacter("Alorion", template);
		System.out.println(character.toJson(true));
		
		fail("Not yet implemented");
	}

}