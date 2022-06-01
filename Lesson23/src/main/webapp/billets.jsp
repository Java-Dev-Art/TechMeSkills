<!DOCTYPE html>
<html>
<head>
    <title>Billets</title>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">

    <!-- jQuery library -->
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>

    <!-- Popper JS -->
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>

    <!-- Latest compiled JavaScript -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>

</head>
<body>
<div class="container p-3 my-3 bg-primary text-white">
    <h1>Service where you can buy tickets</h1>
    <p>Chose your city and target</p>
</div>
<div class="container">
    <form class="form-inline" action="/action_page.php">
        <label for="wf" class="mb-2 mr-sm-2">Where from :</label>
        <input type="text" class="form-control mb-2 mr-sm-2" id="wf" placeholder="where from" name="wf">
        <label for="where" class="mb-2 mr-sm-2">Where :</label>
        <input type="text" class="form-control mb-2 mr-sm-2" id="where" placeholder="where" name="where">
        <label for="time">
            <select id="time">
                <option value="8:00">8:00</option>
                <option value="8:30">8:30</option>
                <option value="9:00">9:00</option>
                <option value="9:30">9:30</option>
                <option value="10:00">10:00</option>
                <option value="10:30">10:30</option>
                <option value="11:00">11:00</option>
                <option value="11:30">11:30</option>
                <option value="12:00">12:00</option>
                <option value="12:30">12:30</option>
                <option value="13:00">13:00</option>
                <option value="13:30">13:30</option>
                <option value="14:00">14:00</option>
                <option value="14:30">14:30</option>
            </select>
        </label>
        <button type="submit" class="btn btn-primary mb-2">
            <span class="spinner-border spinner-border-sm"></span>
            Submit
        </button>

    </form>
</div>


</body>
</html>