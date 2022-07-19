package com.roopsai.implementations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Games {

    public static class TeamUniform {
        int home, guest;
        TeamUniform(int home, int guest) {
            this.home = home;
            this.guest = guest;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int teams = scanner.nextInt();
        List<TeamUniform> uniformList = new ArrayList<>(teams);
        for(int i = 0; i < teams; i++) {
            int home = scanner.nextInt();
            int guest = scanner.nextInt();
            TeamUniform uniforms = new TeamUniform(home, guest);
            uniformList.add(uniforms);
        }
        int output = 0;
        for(TeamUniform teamUniform: uniformList) {
            int home = teamUniform.home;

            for(TeamUniform teamUniform1: uniformList) {
                output += teamUniform1.guest == home ? 1: 0;
            }
        }
        System.out.println(output);
    }
}
