enum Methodologies {
    Evo(5),
    XP(21),
    Scrum(30)

    final int daysInteration

    Methodologies(days) {
        daysInteration = days
    }

    def iterationDetails() {
        println "${this} recommends $daysInteration days for interation"
    }
}

for (methodology in Methodologies.values()) {
    methodology.iterationDetails()
}

