import java.util.List;

public class JSONDatasetMapper {
    List<Description> prizes;

    public JSONDatasetMapper(List<Description> prizes) {
        this.prizes = prizes;
    }

    public List<Description> getPrizes() {
        return prizes;
    }

    public void setPrizes(List<Description> prizes) {
        this.prizes = prizes;
    }

    class Description{
        String year;
        String category;
        List<NobelDescriptionList> laureates;

        public Description() {}

        public Description(String year, String category, List<NobelDescriptionList> laureates) {
            this.year = year;
            this.category = category;
            this.laureates = laureates;
        }

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public List<NobelDescriptionList> getLaureates() {
            return laureates;
        }

        public void setLaureates(List<NobelDescriptionList> laureates) {
            this.laureates = laureates;
        }

        class NobelDescriptionList{
            String id;
            String firstname;
            String surname;
            String motivation;
            String share;

            public NobelDescriptionList() {}

            public NobelDescriptionList(String id, String firstname, String surname, String motivation, String share) {
                this.id = id;
                this.firstname = firstname;
                this.surname = surname;
                this.motivation = motivation;
                this.share = share;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getFirstname() {
                return firstname;
            }

            public void setFirstname(String firstname) {
                this.firstname = firstname;
            }

            public String getSurname() {
                return surname;
            }

            public void setSurname(String surname) {
                this.surname = surname;
            }

            public String getMotivation() {
                return motivation;
            }

            public void setMotivation(String motivation) {
                this.motivation = motivation;
            }

            public String getShare() {
                return share;
            }

            public void setShare(String share) {
                this.share = share;
            }
        }
    }
}
